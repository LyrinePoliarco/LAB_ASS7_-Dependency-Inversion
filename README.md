

##NEU Library Resource Management

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types. To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

![Blank diagram (1)](https://github.com/LyrinePoliarco/LAB_ASS7_-Dependency-Inversion/assets/152787755/0d35392c-2f4f-4dbc-bcde-1e3602c3697d)


Description
The solution involves refactoring the program to adhere to the Dependency Inversion Principle (DIP) by introducing an abstraction layer between the Student class and the specific resource types. This allows for flexibility in accommodating new resource types in the future without modifying existing code. The solution maintains SOLID principles, ensuring that high-level modules depend on abstractions rather than concrete implementations.
