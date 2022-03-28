using System;
using static System.Console;

namespace Boucles
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Les Boucles!");

            // Boucler avec l'instruction “while”
            int x = 0;

            while (x < 10)
            {
                WriteLine(x);
                x++;
            }

            Console.ReadLine(); //press Enter

            // Boucler avec l'instruction “do”
            string? password;
            int attempts = 0;

            do
            {
                attempts++;
                Write("Enter your password: ");
                password = ReadLine();
            }
            while ((password != "Pa$$w0rd") & (attempts < 3));

            Console.ReadLine(); //press Enter

            if (attempts < 10)
            {
                WriteLine("Correct!");
            }
            else
            {
                WriteLine("You have used 10 attempts!");
            }

            Console.ReadLine(); //press Enter

            // Boucler avec l'instruction “for”
            for (int y = 1; y <= 10; y++)
            {
                WriteLine(y);
            }

            Console.ReadLine(); //press Enter

            // Boucler avec l'instruction “foreach”
            string[] names = { "Adam", "Barry", "Charlie" };

            foreach (string name in names)
            {
                WriteLine($"{name} has {name.Length} characters.");
            }

            Console.ReadLine(); //press Enter

        }
    }
}
