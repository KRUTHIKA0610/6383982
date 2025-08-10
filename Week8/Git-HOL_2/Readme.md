# .gitignore in Git

## What is .gitignore?
- The .gitignore file is a special file in Git that tells Git which files or directories to ignore.
- Ignored files are not tracked by Git and will not appear in commits.
- This is useful for excluding temporary files, build artifacts, logs, and sensitive information from version control.

## Why use `.gitignore`?
- To keep the repository clean and free from unnecessary files.
- To prevent committing files that are machine-specific or environment-specific.
- To avoid pushing sensitive data such as passwords, API keys, or configuration files.

## How to Ignore Files Using `.gitignore`
1. Create a .gitignore file in the root of your Git repository.
2. Add patterns for files or directories you want to ignore.  
   Examples:
   Ignore all .log files
      *.log

   Ignore the log directory
      /log/
   Ignore a specific file
    secret.txt
3. Save the .gitignore file.
4. Stage and commit the .gitignore file:
    git add .gitignore
    git commit -m "Added .gitignore to exclude unwanted files"
