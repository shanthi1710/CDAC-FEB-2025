#include <iostream>
#include <fstream>

using namespace std;

void copyBinaryFile(const string &sourceFile, const string &destinationFile)
{

    ifstream fin(sourceFile, ios::binary);
    if (!fin)
    {
        cout << "Error: Unable to open source file!" << endl;
        return;
    }

    ofstream fout(destinationFile, ios::binary);
    if (!fout)
    {
        cout << "Error: Unable to create destination file!" << endl;
        return;
    }
    fout << fin.rdbuf();

    cout << "File copied successfully from " << sourceFile << " to " << destinationFile << endl;

    fin.close();
    fout.close();
}

int main()
{
    string sourceFile, destinationFile;

    cout << "Enter source binary file name: ";
    cin >> sourceFile;

    cout << "Enter destination binary file name: ";
    cin >> destinationFile;

    copyBinaryFile(sourceFile, destinationFile);

    return 0;
}
