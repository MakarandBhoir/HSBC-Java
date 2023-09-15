import Header from "./component/Header";
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Page1 from "./component/Page1";
import Page2 from "./component/Page2";
import Page3 from "./component/Page3";

function App() {
  return (
    <div className="container">
      <Header title="React SPA Project"
        description="A single-page application (SPA) is a web application or website that interacts with the user by dynamically 
        rewriting the current web page with new data from the web server, instead of the default method of a web browser 
        loading entire new pages."
      />
      <Router>
        <Routes>
          <Route path="/page1" element={<Page1 />} />
          <Route path="/page2" element={<Page2 />} />
          <Route path="/page3" element={<Page3 />} />
        </Routes>
      </Router>


    </div>
  );
}

export default App;
