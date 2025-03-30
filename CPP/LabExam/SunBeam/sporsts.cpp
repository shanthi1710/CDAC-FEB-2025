#include <iostream>
#include <vector>
#include <string>
using namespace std;

// Base class representing a Sport
class Sport
{
public:
    string name;
    double fees;

    Sport(string name, double fees) : name(name), fees(fees) {}
    virtual void display()
    {
        cout << "Sport: " << name << ", Fees: $" << fees << endl;
    }
    virtual ~Sport() {} // Virtual destructor for proper cleanup
};

// Derived class representing an Indoor Sport
class IndoorGame : public Sport
{
public:
    string venueType; // e.g., Hall, Court, Table

    IndoorGame(string name, double fees, string venueType)
        : Sport(name, fees), venueType(venueType) {}

    void display() override
    {
        cout << "Indoor Sport: " << name << ", Fees: ₹" << fees
             << ", Venue: " << venueType << endl;
    }
};

// Derived class representing an Outdoor Sport
class OutdoorGame : public Sport
{
public:
    string groundType; // e.g., Grass, Clay

    OutdoorGame(string name, double fees, string groundType)
        : Sport(name, fees), groundType(groundType) {}

    void display() override
    {
        cout << "Outdoor Sport: " << name << ", Fees: $" << fees
             << ", Ground: " << groundType << endl;
    }
};

// Class representing a Player
class Player
{
public:
    int id;
    string player_name;
    vector<Sport *> sports; // Stores the sports the player is enrolled in

    Player(int id, string name) : id(id), player_name(name) {}

    void enroll(Sport *sport)
    {
        sports.push_back(sport);
    }

    void display()
    {
        cout << "Player ID: " << id << ", Name: " << player_name << "\nSports Enrolled: ";
        if (sports.empty())
        {
            cout << "None\n";
        }
        else
        {
            for (auto s : sports)
            {
                cout << s->name << " ";
            }
            cout << endl;
        }
    }
};

// Global vectors to store Players and Sports
vector<Player> players;
vector<Sport *> sports;

// Function to add a new player
void addPlayer()
{
    int id;
    string name;
    cout << "Enter Player ID: ";
    cin >> id;
    cout << "Enter Player Name: ";
    cin.ignore();
    getline(cin, name);
    players.push_back(Player(id, name));
    cout << "Player added successfully!\n";
}

// Function to add a new sport
void addSport()
{
    int type;
    string name, venueOrGround;
    double fees;

    cout << "Enter Sport Name: ";
    cin.ignore();
    getline(cin, name);
    cout << "Enter Fees: ";
    cin >> fees;
    cout << "Choose Sport Type (1: Indoor, 2: Outdoor): ";
    cin >> type;

    if (type == 1)
    {
        cout << "Enter Venue Type (Hall, Court, Table): ";
        cin.ignore();
        getline(cin, venueOrGround);
        sports.push_back(new IndoorGame(name, fees, venueOrGround));
    }
    else if (type == 2)
    {
        cout << "Enter Ground Type (Grass, Clay): ";
        cin.ignore();
        getline(cin, venueOrGround);
        sports.push_back(new OutdoorGame(name, fees, venueOrGround));
    }
    else
    {
        cout << "Invalid choice!\n";
    }
    cout << "Sport added successfully!\n";
}

// Function to enroll a player in a sport
void enrollPlayer()
{
    int playerId, sportIndex;
    cout << "Enter Player ID: ";
    cin >> playerId;

    // Find the player
    Player *player = nullptr;
    for (auto &p : players)
    {
        if (p.id == playerId)
        {
            player = &p;
            break;
        }
    }

    if (!player)
    {
        cout << "Player not found!\n";
        return;
    }

    cout << "Available Sports:\n";
    for (size_t i = 0; i < sports.size(); i++)
    {
        cout << i + 1 << ". ";
        sports[i]->display();
    }

    cout << "Enter Sport Number to Enroll: ";
    cin >> sportIndex;

    if (sportIndex > 0 && sportIndex <= sports.size())
    {
        player->enroll(sports[sportIndex - 1]);
        cout << "Player enrolled successfully!\n";
    }
    else
    {
        cout << "Invalid choice!\n";
    }
}

// Function to display players in indoor sports
void displayIndoorPlayers()
{
    cout << "Players Enrolled in Indoor Games:\n";
    for (auto &player : players)
    {
        bool hasIndoor = false;
        for (auto s : player.sports)
        {
            if (dynamic_cast<IndoorGame *>(s))
            {
                hasIndoor = true;
                break;
            }
        }
        if (hasIndoor)
            player.display();
    }
}

// Function to display players in outdoor sports
void displayOutdoorPlayers()
{
    cout << "Players Enrolled in Outdoor Games:\n";
    for (auto &player : players)
    {
        bool hasOutdoor = false;
        for (auto s : player.sports)
        {
            if (dynamic_cast<OutdoorGame *>(s))
            {
                hasOutdoor = true;
                break;
            }
        }
        if (hasOutdoor)
            player.display();
    }
}

// Function to display all players with their registered sports
void displayAllPlayers()
{
    cout << "All Players:\n";
    for (auto &player : players)
    {
        player.display();
    }
}

// Main function with menu-driven system
int main()
{
    int choice;
    while (true)
    {
        cout << "\nSports Management System Menu:\n";
        cout << "1. Add New Player\n";
        cout << "2. Add New Sport\n";
        cout << "3. Enroll Player into Sport\n";
        cout << "4. Display Players with Indoor Games\n";
        cout << "5. Display Players with Outdoor Games\n";
        cout << "6. Display All Players with Registered Sports\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            addPlayer();
            break;
        case 2:
            addSport();
            break;
        case 3:
            enrollPlayer();
            break;
        case 4:
            displayIndoorPlayers();
            break;
        case 5:
            displayOutdoorPlayers();
            break;
        case 6:
            displayAllPlayers();
            break;
        case 7:
            // Clean up dynamically allocated memory
            for (auto sport : sports)
            {
                delete sport;
            }
            return 0;
        default:
            cout << "Invalid choice! Try again.\n";
        }
    }

    return 0;
}