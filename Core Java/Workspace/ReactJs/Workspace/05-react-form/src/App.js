import Header from "./student/component/Header";
import AddStudent from "./student2/component/addStudent";

function App() {
  return (
    <div className="container">
      <Header title="React Form Project"
        description="This project will demonstrate how to use form in React."
      />
      <AddStudent />
    </div>
  );
}

export default App;
