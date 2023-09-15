import React from 'react';
import StudentService from '../service/StudentService';

function ViewStudents() {
    const [students, setStudents] = React.useState([]);
    React.useEffect(() => {
        // call service
        let service = new StudentService();
        service.findAllStudents().then((result) => {
            //  alert("alert-1")
            //alert(JSON.stringify(result.data))
            setStudents(result.data);
        }).catch(() => {

        })
        //alert("alert-2");

    }, [])
    return (
        <div>
            {students.length > 0 ?
                (<div>
                    <table className='table table-bordered'>
                        <thead>
                            <tr>
                                <th>Student Id</th>
                                <th>Student Name</th>
                                <th>Student Score</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                students.map((s) => (
                                    <tr>
                                        <td> {s.studentId} </td>
                                        <td> {s.studentName} </td>
                                        <td> {s.studentScore} </td>
                                        <td><button className='btn btn-danger'
                                            onClick={() => {
                                                let service = new StudentService();
                                                service.deleteStudent(s.studentId).then(() => {
                                                    alert("Student is deleted.");
                                                    service.findAllStudents().then((result) => {
                                                        setStudents(result.data);
                                                    })
                                                })
                                            }}
                                        >Delete</button></td>
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
export default ViewStudents;