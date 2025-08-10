# Conditional Rendering in React

Conditional rendering in React allows components to render different outputs based on specific conditions. It works similarly to JavaScript conditions. You can use:

- **if/else statements**
- **ternary operators**
- **logical && operator**
- **switch statements**

### Example using Ternary Operator:
```jsx
{isLoggedIn ? <UserDashboard /> : <LoginForm />}
```

---

# Element Variables

Element variables are used to store elements and render them conditionally. Instead of using inline conditions in JSX, you can assign JSX to a variable and include it in your return statement.

### Example:
```jsx
let button;
if (isLoggedIn) {
  button = <LogoutButton />;
} else {
  button = <LoginButton />;
}

return (
  <div>{button}</div>
);
```

---

# Preventing Component Rendering

To prevent a component from rendering, return `null` in its `render` method or function body. React ignores `null` and does not render anything in the DOM.

### Example:
```jsx
function WarningBanner({ warn }) {
  if (!warn) {
    return null;
  }
  return <div className="warning">Warning!</div>;
}
```
This technique is useful for hiding components without affecting the component tree structure.
