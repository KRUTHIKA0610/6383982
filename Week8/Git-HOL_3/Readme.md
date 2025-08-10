# Branching and Merging in Git & Merge Requests in GitLab

## Branching in Git
- **Definition**: A branch in Git is a separate line of development that allows you to work on features or fixes without affecting the main codebase.
- **Purpose**:
  - Work independently on new features.
  - Experiment without risking production code.
  - Collaborate efficiently in teams.

### Creating a Branch

git branch new-branch
This creates a new branch but does not switch to it.

To switch:

git checkout new-branch
Or create and switch in one step:


git checkout -b new-branch
## Merging in Git
Definition: Merging combines changes from one branch into another.

Process:

Switch to the target branch (e.g., master or main).

### Merge the source branch:


git merge source-branch
### Merge Conflicts:

Occur when changes overlap between branches.

Must be resolved manually before completing the merge.

Creating a Branch Request in GitLab
Branch Request: In GitLab, you typically create a branch in the remote repository to work on a feature or issue.

### Steps:

Go to your GitLab project.

Navigate to Repository → Branches.

Click New branch.

Enter the branch name and select the source branch (usually main or master).

Click Create branch.

### Creating a Merge Request in GitLab
Merge Request (MR): A request to merge changes from one branch into another in GitLab.

### Purpose:

Review code before merging.

Discuss and collaborate on changes.

Ensure quality and approval process.

## Steps:

In GitLab, go to your project.

Click Merge requests → New merge request.

Select the source branch (the one with your changes) and the target branch (where changes should go).

Add a title and description explaining the changes.

Assign reviewers or approvers.

Click Submit merge request.

After review and approval, the MR can be merged into the target branch.
