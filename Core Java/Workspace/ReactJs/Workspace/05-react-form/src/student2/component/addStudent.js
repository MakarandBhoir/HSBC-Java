import React from 'react';
import { Student } from '../model/student';

class AddStudent extends React.Component {
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
                <h2><span className='badge badge-primary'>Student Form</span></h2>
                <form>
                    <div>
                        <label>Student Id</label>
                        <div>
                            <input type='text' id='studentId' name='studentId' className='form-control'
                                value={this.state.student.studentId}
                                onChange={(e) => this.setState({ student: { ...this.state.student, studentId: e.target.value } })}
                            />
                        </div>
                    </div>
                    <div>
                        <label>Student Name</label>
                        <div><input type='text' id='studentName' name='studentName' className='form-control'
                            value={this.state.student.studentName}
                            onChange={(e) => this.setState({ student: { ...this.state.student, studentName: e.target.value } })}
                        /></div>
                    </div>
                    <div>
                        <label>Student Score</label>
                        <div><input type='text' id='studentScore' name='studentScore' className='form-control'
                            value={this.state.student.studentScore}
                            onChange={(e) => this.setState({ student: { ...this.state.student, studentScore: e.target.value } })}
                        /></div>
                    </div>
                    <div>
                        <button className='form-control my-4 btn btn-primary'
                            onClick={(e) => {
                                e.preventDefault();
                                //alert(JSON.stringify(this.state.student))
                                this.state.students.push(this.state.student);
                                alert(JSON.stringify(this.state.students))
                                this.setState({ students: this.state.students, student: new Student() })
                            }}
                        >Add Student</button>
                    </div>
                </form>
                {this.state.students.length > 0 ?
                    (<div>
                        <table>
                            <thead>
                                <tr>
                                    <th>Student Id</th>
                                    <th>Student Name</th>
                                    <th>Student Score</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.students.map((s) => (
                                        <tr>
                                            <td> {s.studentId} </td>
                                            <td> {s.studentName} </td>
                                            <td> {s.studentScore} </td>
                                        </tr>
                                    ))
                                }
                            </tbody>
                        </table>
                    </div>)
                    :
                    (<div>
                        <div className='alert alert-danger'>No Student Available.</div>
                    </div>)}

            </div>
        );
    }
}
export default AddStudent;