import React from 'react'

function Header() {
  return (
    <div style={{height:'50px',backgroundColor : "black", width: "100%", justifyContent: "space-between"}}>
        {/* <div style={{color : "green", position:""}}><p> NewtonBand.com</p></div> */}
        <div style={{display: "flex", justifyContent: "space-between", alignItems: "center"}}>
  <p style={{color: "white", fontSize: "25px", fontFamily: "cursive", margin: "6px", padding: "2px", fontWeight: "bold"}}>
    NewtonBand.com
  </p>
  
  <div style={{flex: "1", textAlign: "center"}}>
    <input style={{ margin: "8px", padding: "5px", width: "400px", height: "25px"}} />
  </div>
  
  <p style={{color: "white", fontSize: "25px", fontFamily: "cursive", margin: "6px", padding: "2px", fontWeight: "bold"}}>
    Cart
  </p>
</div>  

     {/* <div style={{}}}></div>
     <div></div>
     <div></div> */}
     </div>
  )
}

export default Header
