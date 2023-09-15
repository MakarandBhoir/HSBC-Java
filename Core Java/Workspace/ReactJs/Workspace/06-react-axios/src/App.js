import Header from "./student/component/Header";
import AddStudent from "./student/component/addStudent";
import ViewStudents from "./student/component/viewStudents";

function App() {
  return (
    <div className="container">
      <Header title="React Axios Project"
        description="This project will demonstrate how to connect fron-end application to back-end application using axios module."
      />
      <AddStudent />
      <ViewStudents />
    </div>
  );
}
export default App;
