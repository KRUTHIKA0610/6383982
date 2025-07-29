## Understanding the Need for Styling React Components

Styling in React is crucial to build visually appealing and interactive user interfaces. It improves the user experience, maintains UI consistency, and supports component-based architecture.

### Benefits:
- Component-specific styling scope
- Cleaner separation of concerns
- Enhanced maintainability and reusability
- Avoids global style conflicts

---

## Working with CSS Modules

CSS Modules offer scoped and modular styling, preventing class name conflicts in large applications.

### Usage:
1. Create a file named `ComponentName.module.css`
2. Import it in the component:
  
   import styles from './ComponentName.module.css';
Apply styles using:
<div className={styles.box}></div>

### Benefits:
Local scoping by default

Encapsulated styling

Supports reusable and composable styles

## Working with Inline Styles
Inline styles are JavaScript objects used to style elements directly within the component.

const headingStyle = {
  color: 'blue',
  fontSize: '20px'
};

<h1 style={headingStyle}>Hello</h1>;

## Use Cases:
Dynamic styling based on state or props
Quick or conditional styles

## Limitations:
Cannot use pseudo-classes (e.g., :hover)
No media query support
