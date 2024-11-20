import {Route, Routes } from 'react-router-dom';
import { Home } from './Home';
import { Contact } from './Contact';
import { About } from './About';

export function AppRouter(){
    return(
        <>
            <Routes>
              <Route path='/' element={<Home></Home>}></Route>
              <Route path='/contact' element={<Contact/>}></Route>
              <Route path='/about' element={<About/>}></Route>
            </Routes>
        </>
    )
}