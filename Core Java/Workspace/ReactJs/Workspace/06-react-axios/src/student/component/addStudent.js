import React from 'react';
import { Student } from '../model/student';
import StudentService from '../service/StudentService';


class AddStudent extends React.Component {
    constructor() {
        super();
        this.state = {
            student: new Student()
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
                                let service = new StudentService();
                                service.addStudent(this.state.student).then((result) => {
                                    alert(result)
                                }).catch((error) => {
                                    alert(error);
                                })
                            }}
                        >Add Student</button>
                    </div>
                </form>
            </div>
        );
    }
}
export default AddStudent;