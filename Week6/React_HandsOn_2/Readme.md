

## React Components .

In React, a **component** is a reusable, independent piece of UI that can have its own state and logic. Components allow you to split the UI into smaller, manageable parts. Each component can be rendered individually and can accept **props** (input data) to make it dynamic.

React components come in two main forms:
- **Class Components**
- **Function Components**

---

## Differences Between React Components and JavaScript Functions

| Aspect                    | React Component                                | JavaScript Function                        |
|---------------------------|------------------------------------------------|---------------------------------------------|
| Purpose                   | Used to define UI elements in React            | Performs generic tasks or computations      |
| JSX Support               | Returns JSX (HTML-like syntax)                 | Does not typically return JSX               |
| Lifecycle Methods         | Available in class components (`componentDidMount`, etc.) | Not applicable                            |
| React Integration         | Works with state, props, hooks, rendering      | No built-in support for React features      |
| Output                    | Returns a React element                        | Returns a value (number, string, object, etc.) |

---

## Types of React Components

1. **Class Components** – ES6 classes that extend `React.Component`. They can maintain their own state and use lifecycle methods.
2. **Function Components** – Plain JavaScript functions that return JSX. With the introduction of Hooks, they can also manage state and side effects.
3. **Pure Components** – Special class components that prevent unnecessary re-renders by doing a shallow comparison of props and state.
4. **Higher-Order Components (HOC)** – Functions that take a component and return a new component with additional behavior.

---

## Class Component

A **Class Component** is a React component defined using ES6 class syntax. It extends `React.Component` and must implement a `render()` method that returns JSX.

import React, { Component } from 'react';

class Welcome extends Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}

## Function Component
A Function Component is a simpler way to define a React component using a JavaScript function. With the addition of Hooks, function components can manage state and side effects.

import React from 'react';

function Welcome(props) {
  return<h1>Hello, {props.name}</h1>;
}

With Hooks:
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  return <button onClick={() => setCount(count + 1)}>Count: {count}</button>;
}


## Component Constructor
In class components, the constructor is a special method used to:

Initialize the component’s state

Bind event handler methods

Receive props

class MyComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }
}

## render() Function
The render() function is a required method in class components. It returns the JSX that should be rendered on the screen. It must return a single parent element or null.

class MyComponent extends React.Component {
  render() {
    return (
      <div>
        <h1>Hello, React!</h1>
      </div>
    );
  }
}
