#include <iostream>
#include <string>
using namespace std;
void encrypt(char input[], int key)
{
    for (int i = 0; input[i] != '\0'; ++i)
    {
        char ch = input[i];
        if (ch >= 'a' && ch <= 'z')
        {
            ch = ch + key;
            if (ch > 'z')
            {
                ch = ch - 'z' + 'a' - 1;
            }
        }
        if (ch >= 'A' && ch <= 'Z')
        {
            ch = ch + key;
            if (ch > 'Z')
            {
                ch = ch - 'Z' + 'A' - 1;
            }
        }
        input[i] = ch;
    }
    cout << "Encrypted message: " << input;
}
void decrypt(char input[], int key)
{
    for (int i = 0; input[i] != '\0'; ++i)
    {
        char ch = input[i];
        if (ch >= 'a' && ch <= 'z')
        {
            ch = ch - key;
            if (ch < 'a')
            {
                ch = ch + 'z' - 'a' + 1;
            }
        }
        if (ch >= 'A' && ch <= 'Z')
        {
            ch = ch - key;
            if (ch < 'A')
            {
                ch = ch + 'Z' - 'A' + 1;
            }
        }
        input[i] = ch;
    }
    cout << "Decrypted message: " << input;
}
int main()
{
    char message[100], ch;
    int key = 3;
    cout << " **------Lab report of Prensu Dangol------**" << endl;
    cout << "Enter a message to encrypt:";
    cin.getline(message, 100);
    encrypt(message, key);
    cout << endl;
    decrypt(message, key);
    return 0;
}
