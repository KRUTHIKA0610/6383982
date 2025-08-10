
# React Events

React events are how user interactions such as clicks, key presses, and form submissions are handled in React components. These are similar to DOM events but are wrapped in React’s synthetic system for cross-browser consistency.

# Event Handlers in React

Event handlers are functions triggered when a specific event occurs. In React, they are attached using JSX syntax and camelCase naming.

# Example of an Event Handler

```jsx
function handleClick() {
  alert('Button clicked!');
}

<button onClick={handleClick}>Click Me</button>
```

# Synthetic Event

React uses a system called **SyntheticEvent** to wrap the browser’s native event system. This provides a consistent interface for events across different browsers.

# Example of Synthetic Event Usage

```jsx
function handleInput(event) {
  console.log(event.target.value); // SyntheticEvent is used here
}
```

# React Event Naming Convention

React follows camelCase for event names and passes the event handler as a function.

# Comparison with HTML

- HTML: `onclick="handleClick()"`
- React: `onClick={handleClick}`

# Common Event Name Conventions in React

| HTML Event Attribute | React Equivalent |
|----------------------|------------------|
| onclick              | onClick          |
| onchange             | onChange         |
| onsubmit             | onSubmit         |
| onmouseover          | onMouseOver      |
| onkeydown            | onKeyDown        |
