#include <iostream>
#include <fstream>

using namespace std;

class Book
{
private:
    int bookID;
    char title[50];
    char author[50];

public:
    Book() : bookID(0) {}

    void acceptBook()
    {
        cout << "Enter Book ID: ";
        cin >> bookID;
        cin.ignore();

        cout << "Enter Book Title: ";
        cin.getline(title, 50);

        cout << "Enter Author Name: ";
        cin.getline(author, 50);
    }

    void displayBook() const
    {
        cout << "Book ID: " << bookID << "\nTitle: " << title << "\nAuthor: " << author << "\n\n";
    }

    int getBookID() const
    {
        return bookID;
    }
};

void addBook()
{
    ofstream fout("books.dat", ios::binary | ios::app);
    if (!fout)
    {
        cout << "Error opening file!" << endl;
        return;
    }

    Book book;
    book.acceptBook();
    fout.write((char *)&book, sizeof(Book));
    fout.close();

    cout << "Book added successfully!" << endl;
}

void displayAllBooks()
{
    ifstream fin("books.dat", ios::binary);
    if (!fin)
    {
        cout << "No books found!" << endl;
        return;
    }

    Book book;
    while (fin.read((char *)&book, sizeof(Book)))
    {
        if (book.getBookID() != 0)
        {
            book.displayBook();
        }
    }
    fin.close();
}

void displayBookAtPosition(int pos)
{
    ifstream fin("books.dat", ios::binary);
    if (!fin)
    {
        cout << "File not found!" << endl;
        return;
    }

    fin.seekg(pos * sizeof(Book), ios::beg);
    Book book;
    if (fin.read((char *)&book, sizeof(Book)))
    {
        if (book.getBookID() != 0)
        {
            cout << "\nBook found at position " << pos << ":\n";
            book.displayBook();
        }
        else
        {
            cout << "No valid book found at this position!" << endl;
        }
    }
    else
    {
        cout << "No book found at this position!" << endl;
    }

    fin.close();
}

void deleteBook(int bookID)
{
    ifstream fin("books.dat", ios::binary);
    if (!fin)
    {
        cout << "File not found!" << endl;
        return;
    }

    ofstream fout("temp.dat", ios::binary);
    Book book;
    bool found = false;

    while (fin.read((char *)&book, sizeof(Book)))
    {
        if (book.getBookID() != bookID)
        {
            fout.write((char *)&book, sizeof(Book));
        }
        else
        {
            found = true;
        }
    }

    fin.close();
    fout.close();

    remove("books.dat");
    rename("temp.dat", "books.dat");

    if (found)
    {
        cout << "Book with ID " << bookID << " deleted successfully!" << endl;
    }
    else
    {
        cout << "Book ID not found!" << endl;
    }
}

int main()
{
    int choice, bookID, pos;
    do
    {
        cout << "\n==== Book Management Menu ====\n";
        cout << "1. Add Book\n";
        cout << "2. Display All Books\n";
        cout << "3. Display Book at Specific Position\n";
        cout << "4. Delete Book by ID\n";
        cout << "5. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            addBook();
            break;

        case 2:
            displayAllBooks();
            break;

        case 3:
            cout << "Enter position (0-based index): ";
            cin >> pos;
            displayBookAtPosition(pos);
            break;

        case 4:
            cout << "Enter Book ID to delete: ";
            cin >> bookID;
            deleteBook(bookID);
            break;

        case 5:
            cout << "Exiting program..." << endl;
            break;

        default:
            cout << "Invalid choice! Try again.\n";
        }
    } while (choice != 5);

    return 0;
}

/*
Create Book class and implement the following using file -
● Add Book
● Display all
● Display specific (pos)   - using (tellp, tellg)
● Delete (According to BookId)
*/