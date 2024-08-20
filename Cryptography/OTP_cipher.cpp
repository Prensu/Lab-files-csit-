#include<bits/stdc++.h>
using namespace std;

// // Generate a random key of the same length as the plaintext
// string generate_key(int length)
// {
//     string key;
//     for (int i = 0; i < length; ++i)
//     {
//         key += static_cast<char>(rand() % 256); // Random byte
//     }
//     return key;
// }

// // Encrypt the plaintext using the key
// string encrypt(const string &plaintext, const string &key)
// {
//     string ciphertext;
//     for (size_t i = 0; i < plaintext.length(); ++i)
//     {
//         ciphertext += static_cast<char>(plaintext[i] ^ key[i]);
//     }
//     return ciphertext;
// }

// // Decrypt the ciphertext using the key
// string decrypt(const string &ciphertext, const string &key)
// {
//     return encrypt(ciphertext, key); // XOR operation is symmetric
// }

// int main()
// {
//     srand(static_cast<unsigned>(time(nullptr))); // Seed random number generator

//     string plaintext = "hello nepal";
//     string key = generate_key(plaintext.length());

//     string ciphertext = encrypt(plaintext, key);
//     string decrypted_text = decrypt(ciphertext, key);

//     cout << "Plaintext: " << plaintext << endl;
//     cout << "Ciphertext: " << ciphertext << endl;
//     cout << "Decrypted Text: " << decrypted_text << endl;

//     return 0;
// }
int main()
{
    string s;
    cout << " **------PRENSU Dangol------**" << endl;
    cout << "Enter plaintext: ";
    cin >> s;
    int n = s.length();
    srand(time(NULL));
    int arr[n];
    cout << "Secret key is: ";
    for (int i = 0; i < n; i++)
    {
        arr[i] = rand() % 10;
        cout << arr[i];
    }
    cout << endl;
    char ciphertext[n];
    cout << "One Time Pad ciphertext is: "; 
    for (int i = 0; i < n; i++)
    {
        ciphertext[i] = ((s[i] ^ arr[i]) % 26) + 'a';
        printf("%c", ciphertext[i]);
    }
    cout << endl;
}
