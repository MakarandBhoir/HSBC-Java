import axios from 'axios';

class StudentService {
    findAllStudents() {
        return axios.get('http://localhost:9090/students');
    }
    addStudent(student) {
        return axios.post('http://localhost:9090/students', student);
    }
    deleteStudent(studentId) {
        return axios.delete('http://localhost:9090/students/' + studentId)
    }
}
export default StudentService;