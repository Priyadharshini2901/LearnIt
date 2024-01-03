import React, { useState } from 'react';
import { Route, Routes, useLocation } from 'react-router-dom';
import './App.css';
import Navbar from './component/Navbar';
import GetCourse from './component/GetCourse';
import AddCourse from './component/AddCourse';
import EditCourse from './component/EditCourse';
import ViewCourse from './component/ViewCourse';
import MyComponent from './component/Home';
import Login from './component/LoginForm';
import SignupForm from './component/SignupForm';
import ForgotPasswordForm from './component/Forgot';
import Gallery from './component/Gallery';
import About from './component/About';

function App() {
  // const location = useLocation();
  // const [isLoggedIn, setIsLoggedIn] = useState(false);

  // const handleLogin = () => {
  //   setIsLoggedIn(true);
  // };

  // const handleLogout = () => {
  //   setIsLoggedIn(false);
  // };

  return (
    <>
      {/* {!isLoggedIn && (location.pathname === '/signup' || location.pathname === '/login') && (
        <Routes>
          <Route path="/signup" element={<SignupForm handleLogin={handleLogin} />} />
          <Route path="/login" element={<Login handleLogin={handleLogin} />} />
        </Routes>
      )}

      {isLoggedIn && ( */}
        <>
        {/* <SignupForm/> */}
        {/* <Login/> */}
        
          <Navbar  />
          <Routes>
            <Route path="/l" element={<MyComponent />} />
            <Route path ="/login" element = {<Login/>}></Route> 
            <Route path ="/signup" element = {<SignupForm/>}></Route> 
            <Route path="/" element={<GetCourse />} />
            <Route path="/addCourse" element={<AddCourse />} />
            <Route path="/editCourse/:id" element={<EditCourse />} />
            <Route path="/viewCourse/:id" element={<ViewCourse />} />
            <Route path="/about" element={<About />} />
            <Route path="/gallery" element={<Gallery />} />
          </Routes>
        </>
      
    </>
  );
}

export default App;

// import React from 'react';
// import { Route, Routes ,Router,useLocation} from 'react-router-dom';
// import './App.css';
// import Navbar from './component/Navbar';
// import GetCourse from './component/GetCourse';
// import AddCourse from './component/AddCourse';
// import EditCourse from './component/EditCourse';
// import ViewCourse from './component/ViewCourse';
// import MyComponent from './component/Home';
// import Login from './component/LoginForm';
// import SignupForm from './component/SignupForm';
// import ForgotPasswordForm from './component/Forgot';
// import Gallery from './component/Gallery';
// import About from './component/About';

// function App() {
//   const location = useLocation();
//   const hideNavbar = location.pathname === '/login' || location.pathname === '/signup';

  
  // return (
    <>
    
    {/* <Navbar/>
      <Routes>
       
        <Route path="/l" element={<MyComponent />}></Route>  
         <Route path ="/login" element = {<Login/>}></Route> 
         <Route path ="/signup" element = {<SignupForm/>}></Route> 
         <Route path = "/forgot-password" element={<ForgotPasswordForm/>}></Route>
        <Route path='/' element={<GetCourse />}></Route>
        <Route path='/addCourse' element={<AddCourse />}></Route>
        <Route path='/editCourse/:id' element={<EditCourse />}></Route>
        <Route path='/viewCourse/:id' element={<ViewCourse/>}></Route> 
        <Route path='/about' element ={<About />}></Route>
        <Route path='/gallery' element ={<Gallery/>}></Route>
      </Routes> */}
      
      </> 

//   );
// }

// export default App;
