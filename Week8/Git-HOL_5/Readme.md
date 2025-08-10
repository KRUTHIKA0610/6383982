# How to Clean Up and Push Back to Remote Git

## Purpose
Over time, a Git repository may accumulate unnecessary files, outdated branches, or unmerged changes.  
Cleaning up ensures the repository stays organized and that only relevant changes are pushed to the remote.

---

## 1. Clean Up Local Changes

### Remove Untracked Files and Folders
To delete files not tracked by Git:

git clean -f

To delete untracked files and directories:

git clean -fd

Note: This is irreversible — files will be permanently deleted.

### 2. Delete Unused Local Branches
List local branches:

git branch

Delete a branch that has been merged:

git branch -d branch-name

Force-delete an unmerged branch:

git branch -D branch-name

### 3. Prune Stale Remote Tracking Branches
To remove references to branches that no longer exist on remote:


git fetch --prune
### 4. Pull the Latest Changes
Ensure your local repository is up to date:

git pull origin main
(Replace main with your default branch name if different.)

### 5. Stage and Commit Updated Files

git add .

git commit -m "Cleanup: removed unused files and branches"
### 6. Push Back to Remote
Push the cleaned-up repository to the remote:

git push origin main
