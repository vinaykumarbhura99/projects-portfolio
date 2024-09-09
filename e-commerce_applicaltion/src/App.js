import logo from './logo.svg';
import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import ProductCart from './components/ProductCart';
import Menu_bar from './components/Menu_bar';
import Electronics from './components/Electronics';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <Menu_bar />
        
        {/* Main Content Area where ProductCart or other components will be displayed */}
        {/* <div style={{height:"530px"}}>
          <div style={{height:"100%", width:"10%", backgroundColor:"blue",float:"left"}}>

          </div>
          <div>
          <Routes>
            <Route path="/" element={<ProductCart />} />
            <Route path="/Electronics" element={<Electronics />} />  
          </Routes>
          </div>
          
        </div> */}


      <div className="app-container">
        <div className="side-menu">
          {/* Side menu content here */}
          <h2>Menu</h2>
        </div>
        <div className="main-content">
          <Routes>
            <Route path="/" element={<ProductCart />} />
            <Route path="/Electronics" element={<Electronics />} />
          </Routes>
        </div>
      </div>
        
        {/* <Footer /> */}
      </div>
    </Router>
  );
}

export default App;
