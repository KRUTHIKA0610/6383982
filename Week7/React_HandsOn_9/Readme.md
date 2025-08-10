# React Router

## Why React Router is Needed

Single Page Applications (SPAs) do not reload the entire page when navigating between views. React Router enables routing in React applications without page reloads, allowing seamless navigation and dynamic rendering of components.

## Benefits of React Router

- **Client-side Routing**: Efficient and fast navigation.
- **Declarative Syntax**: Routes are defined using JSX.
- **Nested Routing**: Supports component hierarchy.
- **Dynamic Parameters**: Easily pass data via URLs.
- **History Management**: Built-in browser history control.
- **Programmatic Navigation**: Navigate using code (e.g., after form submission).

## Core Components of React Router

- `BrowserRouter`: Wraps the application and enables routing using HTML5 history API.
- `Routes`: Holds all `Route` definitions.
- `Route`: Defines a path and maps it to a component.
- `Link`: Used to navigate between routes without reloading the page.
- `NavLink`: Like `Link` but allows active style for selected route.
- `useParams()`: Hook to extract URL parameters.
- `useNavigate()`: Hook for navigating programmatically.

## Types of Router Components

| Component        | Description                                                             |
|------------------|-------------------------------------------------------------------------|
| `BrowserRouter`  | Uses HTML5 history API for clean URLs. Most commonly used.              |
| `HashRouter`     | Uses hash (`#`) in the URL. Good for legacy browser support.            |
| `MemoryRouter`   | Keeps the history of your navigation in memory. Useful in testing.      |
| `StaticRouter`   | Used for server-side rendering. Requires location and context manually. |

## Parameter Passing via URL

### Route Declaration with Parameter
```jsx
<Route path="/user/:id" element={<User />} />
