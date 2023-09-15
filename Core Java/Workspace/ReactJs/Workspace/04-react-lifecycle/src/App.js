import React from "react";
import Header from "./Header";
import Main from "./Main";

function App() {
  const [flag, changeFlag] = React.useState(true);
  const [counter, setCounter] = React.useState(0);

  //Lifecyle hook
  React.useEffect(() => {
    console.log('Mounting/Updating/Unmouting Phase.');
  }, [flag])
  return (
    <div className="container">
      <Header title="React Lifecycle Project"
        description="This project will demonstrate to you lifecyle of both class based and function based component"
      />
      <button className="btn btn-warning mx-4" onClick={() => setCounter(counter + 1)}>+</button>
      <label> {counter} </label>
      <button className="btn btn-warning mx-4" onClick={() => setCounter(counter - 1)}>-</button>
      <hr />
      {flag ? (<Main />) : null}
      <hr />
      <button className="btn btn-outline-danger"
        onClick={() => changeFlag(!flag)}>Mount/Upnmount</button>
    </div>
  );
}

export default App;
