function clickHandler() {
    alert("button is click!")
}

function Main() {
    return (
        <table className="table table-bordered">
            <thead>
                <tr>
                    <th>Event Name</th>
                    <th>Event Source</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Click Event</td>
                    <td><button className="btn btn-primary" onClick={clickHandler}>Click Me!</button></td>
                </tr>
                <tr>
                    <td>Click Event</td>
                    <td><button className="btn btn-primary" onClick={() => alert("Click Handler")}>Click Me!</button></td>
                </tr>
            </tbody>
        </table >
    );
}
export default Main;