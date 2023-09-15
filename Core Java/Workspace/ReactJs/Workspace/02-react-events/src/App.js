import Header from "./Header";
import Main from "./Main";

function App() {
  return (
    <div className="container">
      <Header
        title="React Props & State Project"
        desc="This is my react starter project. Understanding JSX."
      />
      <Main />
    </div>
  );
}
export default App;