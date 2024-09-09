import React from 'react'
import { BrowserRouter as Router,Route ,Link, Routes } from 'react-router-dom'
import ProductCart from './ProductCart'
import Electronics from './Electronics'
import '../styles/Menu_bar.css'
function Menu_bar() {
  return (
   

      // <Router>
         <div style={{height:"35px", backgroundColor:"#443b3b", color:"white", display:"flex",justifyContent:"space-between"}}>
      {/* <div>menu</div>
      <div>phones</div>
      <div>books</div>
      <div>Electronis</div> */}
          <div className='botton'>
            <Link to="/" className="button-link" >Home</Link>
          </div>
          <div className='botton'>
            <Link to="/Mobiles" style={{ textDecoration: 'none', color: 'inherit' }}>Mobiles</Link>
          </div>
          <div className='botton'>
            <Link to="/Electronics" style={{ textDecoration: 'none', color: 'inherit' }}>Electronics</Link>
          </div>
          <div className='botton'>
            <Link to="/Books" style={{ textDecoration: 'none', color: 'inherit' }}>Books</Link>
          </div>
          <div className='botton'>
            <Link to="/Fashion" style={{ textDecoration: 'none', color: 'inherit' }}>Fashion</Link>
          </div>

          {/* <Routes>
            <Route path='/' element={ < ProductCart />}/>
            <Route path='/Electronics' element={<Electronics/>} />
          </Routes> */}

        </div>
  

      
   
  )
}

export default Menu_bar
