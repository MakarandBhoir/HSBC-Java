import React from "react";
import Student from "../model/Student";
class Main extends React.Component {
    constructor() {
        super();
        this.state = { student: new Student() };
    }
    render() {
        return (
            <div>
                <form>
                    <h2><span className="badge badge-dark">Student Form</span></h2>
                    <div className="form-group">
                        <label>Student Id</label>
                        <input className="form-control" type="text" id="studentId" name="studentId" placeholder="Enter Student Id"
                            value={this.state.student.studentId}
                            onChange={(e) => this.setState({ student: { ...this.state.student, studentId: e.target.value } })}
                        />
                    </div>
                    <div className="form-group">
                        <label>Student Name</label>
                        <input className="form-control" type="text" id="studentName" name="studentName" placeholder="Enter Student Name"
                            value={this.state.student.studentName}
                            onChange={(e) => this.setState({ student: { ...this.state.student, studentName: e.target.value } })}
                        />
                    </div>
                    <div className="form-group">
                        <label>Student Score</label>
                        <input className="form-control" type="text" id="studentScore" name="studentScore" placeholder="Enter Student Score"
                            value={this.state.student.studentScore}
                            onChange={(e) => this.setState({ student: { ...this.state.student, studentScore: e.target.value } })}
                        />
                    </div>
                    <button className="btn btn-primary" onClick={(event) => {
                        alert(JSON.stringify(this.state.student));
                        event.preventDefault();
                    }}>Submit</button>
                </form>
            </div>
        )
    }
}
export default Main;