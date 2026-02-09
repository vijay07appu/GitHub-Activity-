📊 GitHub Activity CLI Application

A Java-based Command Line Interface (CLI) application that fetches and displays the recent public activity of a GitHub user using the GitHub REST API.
This project demonstrates API consumption, JSON handling, and clean CLI design using Core Java.

📌 Features

✔ Fetch recent GitHub user activity
✔ Uses GitHub REST API
✔ Displays activity in readable CLI format
✔ Handles invalid usernames gracefully
✔ Clean and modular Java code
✔ Simple command-line usage

🛠️ Technologies Used

Java (Core Java)
GitHub REST API
WebClient - used webClient instead of httpClient
JSON Processing
OOP Principles
Git & GitHub

📂 Project Structure
github-activity-cli/
│
├── src/
│   ├── client/
│   │   └── GitHubApiClient.java
│   ├── service/
│   │   └── GitHubActivityService.java
│   ├── runner/
│       └── GitHubActivityRunner.java
│
├── README.md
└── .gitignore

▶️ Runner File (Entry Point)

GitHubActivityRunner.java is the main entry point of the application.

Responsibilities:

Accepts GitHub username as a command-line argument
Initiates API call
Triggers service layer
Displays activity output in terminal


🔁 Application Workflow

User runs the application with a GitHub username
Runner class captures input
API client sends  HTTP request to GitHub
JSON response is received
JSON is parsed into Java objects
Activity details are formatted
Output is displayed in terminal

🚀 How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/your-username/github-activity-cli.git

2️⃣ Navigate to Project Directory
cd github-activity-cli

3️⃣ Compile the Project
javac src/runner/GitHubActivityRunner.java

4️⃣ Run the Application
java src.runner.GitHubActivityRunner <github-username>

✅ Example
java src.runner.GitHubActivityRunner octocat

⚠️ Error Handling

Invalid GitHub username
Network connection errors
Graceful error messages in CLI

🧠 Key Concepts Demonstrated
REST API consumption
HTTP request handling
JSON parsing
CLI argument handling
Separation of concerns
Clean architecture
Exception handling

🔧 Git Workflow Used
git init
git add .
git commit -m "Initial commit"
git remote add origin <repository-url>
git push -u origin main



👨‍💻 Author

Vijay JD
