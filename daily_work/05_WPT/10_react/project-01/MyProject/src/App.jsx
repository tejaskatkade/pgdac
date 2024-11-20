import { useState } from 'react'
import { MyComponent } from './MyComponent.jsx'
import { NavigationBar } from './NavigationBar.jsx'
import { Greet } from './Greet.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <NavigationBar></NavigationBar>
        <h1>Hello world</h1>
        <MyComponent> </MyComponent>
        <Greet name="Tejas" email="tsk@gmail.com"></Greet>
    </>
  )
}

export default App
