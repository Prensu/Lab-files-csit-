// #include <bits/stdc++.h>
// #include <cmath>
// #include <cstdlib>
// using namespace std;
// // Function to compute the greatest common divisor (GCD)
// int gcd(int a, int b)
// {
//     if (b == 0)
//         return a;
//     else
//         return gcd(b, a % b);
// }

// // Generating large random numbers for keys
// int gen_key(int q)
// {
//     int key = rand() % (q - 1) + 1;
//     while (gcd(q, key) != 1)
//     {
//         key = rand() % (q - 1) + 1;
//     }
//     return key;
// }

// // Modular exponentiation
// int power(int a, int b, int c)
// {
//     int x = 1, y = a;
//     while (b > 0)
//     {
//         if (b % 2 != 0)
//         {
//             x = (x * y) % c;
//         }
//         y = (y * y) % c;
//         b /= 2;
//     }
//     return x % c;
// }

// // Asymmetric encryption
// pair<vector<int>, int> encrypt(const string &msg, int q, int h, int g)
// {
//     vector<int> en_msg;
//     int k = gen_key(q); // Private key for sender
//     int s = power(h, k, q);
//     int p = power(g, k, q);
//     for (char c : msg)
//     {
//         en_msg.push_back(s * static_cast<int>(c));
//     }
//     return {en_msg, p};
// }

// // Decryption
// string decrypt(const vector<int> &en_msg, int p, int key, int q)
// {
//     string dr_msg;
//     int h = power(p, key, q);
//     for (int encrypted_char : en_msg)
//     {
//         dr_msg += static_cast<char>(encrypted_char / h);
//     }
//     return dr_msg;
// }

// int main()
// {
//     string msg = "Radahn";
//     cout << " ------Lab report of Nima Lama(28197/078)------" << endl;
//     cout << "Original Message: " << msg << endl;

//     int q = rand(); // Random large prime number
//     int g = rand() % (q - 1) + 1;
//     int key = gen_key(q); // Private key for receiver
//     int h = power(g, key, q);

//     vector<int> en_msg;
//     int p;
//     tie(en_msg, p) = encrypt(msg, q, h, g);

//     string dr_msg = decrypt(en_msg, p, key, q);
//     cout << "Decrypted Message: " << dr_msg << endl;

//     return 0;
// }
#include <iostream>
#include <cmath>
#include <cstdlib>
using namespace std;
// Function to calculate modular exponentiation (a^b mod c)
int power(int a, int b, int c)
{
    int result = 1;
    a %= c;
    while (b > 0)
    {
        if (b % 2 == 1)
            result = (result * a) % c;
        a = (a * a) % c;
        b /= 2;
    }
    return result;
}

// Function to generate a random key
int generateKey(int q)
{
    return rand() % (q - 1) + 1;
}

int main()
{

    int q = 19; // Prime number
    int g = 10; // Generator (primitive root modulo q)
    // Alice's private key
    int Xa = generateKey(q);
    // Message to encrypt (plaintext)
    int M;
    cout << "Enter the message to encrypt: ";
    cin >> M;

    // Compute public key h = g^a mod q
    int h = power(g, Xa, q);

    cout << "Public key: " << h << endl;

    // Alice's side (encryption)
    int k = generateKey(q); // Random secret key for encryption
    int p = power(g, k, q); // Compute p = g^k mod q

    // Compute ciphertext (c1, c2)
    int c1 = power(h, k, q);
    int c2 = (M * c1) % q;

    cout << "Ciphertext (c1, c2): (" << c1 << ", " << c2 << ")" << endl;

    // Bob's side (decryption)
    int s = power(c1, Xa, q);                             // Compute s = c1^a mod q
    int decryptedMessage = (c2 * power(s, q - 2, q)) % q; // Compute M = c2 * s^(-1) mod q

    cout << "Decrypted message: " << decryptedMessage << endl;

    return 0;
}
