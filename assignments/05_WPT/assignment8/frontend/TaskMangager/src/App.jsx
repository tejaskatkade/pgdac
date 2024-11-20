import { Header } from "./component/Header";
import { BrowserRouter } from "react-router-dom";
import { AppRouter } from "./component/Approuter";

function App() {

  return (
      <BrowserRouter>
        <Header/>
          <AppRouter/>
      </BrowserRouter>

  )
}

export default App
