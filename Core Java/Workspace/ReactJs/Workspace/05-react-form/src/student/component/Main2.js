import React from "react";
import Student from "../model/Student";
class Main extends React.Component {
    constructor() {
        super();
        this.state = {
            student: new Student(),
            students: []
        };
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
                        //alert(JSON.stringify(this.state.student));
                        this.state.students.push(this.state.student);
                        this.setState({ students: this.state.students, student: new Student() });
                        event.preventDefault();
                    }}>Add Student</button>
                </form>
                <div>
                    {
                        this.state.students.length > 0 ?
                            (
                                <table className="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Student Id</th>
                                            <th>Student Name</th>
                                            <th>Student Score</th>
                                            <th>Update?</th>
                                            <th>Delete?</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {this.state.students.map(
                                            (s) => (
                                                <tr key={s.studentId}>
                                                    <td>{s.studentId}</td>
                                                    <td>{s.studentName}</td>
                                                    <td>{s.studentScore}</td>
                                                    <td><button className="btn btn-warning">Update</button></td>
                                                    <td><button className="btn btn-danger">Delete</button></td>
                                                </tr>
                                            )
                                        )}
                                    </tbody>
                                </table>
                            )
                            : <span className="text-danger">No Students Present</span>
                    }
                </div>
            </div>
        )
    }
}
export default Main;