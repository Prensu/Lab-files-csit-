using System;               // Required for basic input/output operations.
using System.Collections.Generic;  // Required for IEnumerable<T> interface.
using System.Linq;          // Required for using LINQ features.

class LINQQueryExpressions
{
    static void Main()
    {
        // Step 1: Specify the data source (an integer array).
        int[] scores = new int[] { 97, 92, 81, 60 };

        // Step 2: Define the query expression using LINQ.
        // This query selects all numbers from 'scores' that are greater than 80.
        IEnumerable<int> scoreQuery =
            from score in scores   // Iterate over each 'score' in 'scores' array.
            where score > 80       // Filter condition: Only include scores greater than 80.
            select score;          // Select and return the filtered scores.

        // Step 3: Execute the query.
        // Since LINQ queries use "deferred execution," the query isn't run until we iterate over it.
        foreach (int i in scoreQuery)
        {
            Console.Write(i + " "); // Print each filtered score, separated by a space.
        }

        // Expected Output:
        // 97 92 81
        // (Since only these numbers are greater than 80)
    }
}
