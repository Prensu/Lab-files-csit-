#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int main()
{
    long int interval;
    int circle_points = 0, square_points = 0;
    double rand_x, rand_y, origin_dist, pi;
    cout << "Monte Carlos SImulation\n" << endl;
    // Initialize random number generator
    srand(time(NULL));
    cout << " Enter the interval: ";
    cin >> interval;
    // Generate points
    for (int i = 0; i < (interval * interval); i++)
    {
        rand_x = double(rand() % (interval + 1)) / interval;
        rand_y = double(rand() % (interval + 1)) / interval;

        origin_dist = rand_x * rand_x + rand_y * rand_y;

        if (origin_dist <= 1)
            circle_points++;

        square_points++;

        // Estimate Pi
        pi = double(4 * circle_points) / square_points;
    }

    cout << "Estimated value of Pi = " << pi << endl;

    return 0;
}
