# React JSX and JavaScript Integration

## Define JSX
JSX (JavaScript XML) is a syntax extension for JavaScript used in React to describe UI elements. It allows you to write HTML-like syntax within JavaScript code, making it easier to create and visualize UI structures.

## Explain about ECMA Script
ECMAScript (ES) is the standardized scripting language specification that JavaScript follows. Modern versions like ES6+ introduce features such as let, const, arrow functions, classes, and modules that improve code readability and maintainability in React apps.

## Explain React.createElement()
React.createElement() is a core method used by React to create elements. JSX is syntactic sugar for React.createElement(). 
Example:
jsx
React.createElement('h1', { className: 'title' }, 'Hello World');
<h1 className="title">Hello World</h1>
## Explain how to create React nodes with JSX
You can create React nodes by writing JSX directly inside a component:
function Welcome() {
  return <h1>Hello, user!</h1>;
}

## Define how to render JSX to DOM
JSX is rendered to the DOM using ReactDOM.render():

jsx
ReactDOM.render(<App />, document.getElementById('root'));

## Explain how to use JavaScript expressions in JSX
You can embed JavaScript expressions in JSX using curly braces {}:

jsx
const name = "React";
const element = <h1>Hello, {name}</h1>;

## Explain how to use inline CSS in JS
Inline styles in JSX use camelCase property names and are passed as objects:
const headingStyle = {
  color: 'blue',
  fontSize: '20px'
};

const element = <h1 style={headingStyle}>Styled Heading</h1>;


