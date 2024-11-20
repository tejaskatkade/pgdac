import { Route, Routes } from 'react-router-dom';
import { ROUTES } from '../constants/RoutesConstants';
import { Home } from './Home';
import { ViewTask } from './ViewTask';
import { AddTask } from './AddTask';

export function AppRouter(){
    return(
        <>
            <Routes>
                <Route path={ROUTES.HOME} element={<Home/>}></Route>
                <Route path={ROUTES.GET_TASK} element={<ViewTask/>}></Route>
                <Route path={ROUTES.ADD_TASK} element={<AddTask/>}></Route>
            </Routes>
        </>
    )
}