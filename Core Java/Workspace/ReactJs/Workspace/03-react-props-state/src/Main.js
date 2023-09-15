import React from 'react';

function Main() {
    const [counter, setCounter] = React.useState(0);

    return (
        <div>
            <button className="btn btn-primary mx-4"
                onClick={() => setCounter(counter + 1)}
            >+</button>
            <label> {counter} </label>
            <button className="btn btn-primary mx-4"
                onClick={() => setCounter(counter - 1)}
            >-</button>
        </div>
    );
}
export default Main;