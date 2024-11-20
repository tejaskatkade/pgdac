import { AppRouter } from "./AppRouter";
import { NavigationBar } from "./NavigationBar"
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <>
      <BrowserRouter>
        <div>
          <NavigationBar />
          <AppRouter></AppRouter>
        </div>
      </BrowserRouter>
    </>
  )
}

export default App
