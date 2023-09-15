import Header from "./Header";
import Main from "./Main";

function App() {
  return (
    <div className="container">
      <Header
        title="React Props Project"
        description="React props are just JavaScript object which is use to pass data from Parent to Child component 
        & props are read-only or immutable."
        projectNumber={3}
      />
      <Main />
    </div>
  );
}

export default App;
