# How to Resolve Merge Conflicts in Git

## What is a Merge Conflict?
A merge conflict occurs when Git cannot automatically combine changes from two branches.  
Common causes:
- The same line in a file was modified in both branches.
- A file was deleted in one branch but modified in another.

---

## Steps to Resolve a Merge Conflict

### 1. Identify the Conflict
Run:

git merge branch-name

If there’s a conflict, Git stops merging and displays:

CONFLICT (content): Merge conflict in <file>
Automatic merge failed; fix conflicts and then commit the result.
Check conflicted files:
git status

### 2. Open the Conflicted Files
Git marks the conflicting sections as:
Code from your current branch
Code from the branch you are merging
branch-name
HEAD → Changes from your branch.
branch-name → Changes from the branch being merged.

### 3. Resolve the Conflict
Manually edit the file to:
Keep only your changes.
Keep only the other branch’s changes.
Combine both changes.
Example resolved content:
Final merged version of the code.
### 4. Mark as Resolved
After editing:
git add <file>
### 5. Complete the Merge
Finish the merge:
git commit
Git creates a merge commit and finalizes the process.

Optional: Use a Merge Tool
For visual conflict resolution:

git mergetool
Tools like P4Merge, VS Code, or Meld make this easier.

