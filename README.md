Catalog_1

Overview

This project is a Java-based Maven application that utilizes the Shamir Secret Sharing algorithm. It includes test cases and resources to demonstrate the program's functionality.

Prerequisites

Make sure the following software is installed:

Java Development Kit (JDK) – version 8 or higher.
Apache Maven – for dependency management and building the project.
Git (optional) – if you want to clone this repository directly.
How to Run

Step 1: Clone the Repository (Optional)
If the code is hosted on GitHub, you can clone it using:

bash
Copy code
git clone <your-github-repo-link>
cd Catalog_1
Alternatively, extract the project folder if you are using the ZIP file.

Step 2: Build the Project
Open a terminal inside the project directory where the pom.xml file is located, and run:

bash
Copy code
mvn clean install
This will download all necessary dependencies and compile the code.

Step 3: Run the Application
You can run the main class using the Maven exec plugin or directly using java:

Option 1: Using Maven

bash
Copy code
mvn exec:java -Dexec.mainClass="org.example.Main"
Option 2: Using Java Command

bash
Copy code
java -cp target/classes org.example.Main
Step 4: Test the Application
The project includes test cases in JSON format located in:

css
Copy code
src/main/resources/test/testcase1.json
src/main/resources/test/testcase2.json
Make sure these files are in the correct location before running the program.

Project Structure

bash
Copy code
Catalog_1/
│
├── pom.xml                # Maven configuration file
├── src/
│   └── main/
│       ├── java/org/example/   # Source code (Main.java, ShamirSecretSharing.java)
│       └── resources/test/     # Test JSON files
└── target/                # Compiled classes (after building the project)
Troubleshooting

Ensure that Java and Maven are correctly installed and added to your system's PATH.
If the build fails, try deleting the target/ folder and re-running mvn clean install.
