import './App.css';
import Estoque from './components/Estoque';

const PRODUCTS = [
  {category: "Fruits",     price: "$1", stocked: true,  name: "Apple"},
  {category: "Fruits",     price: "$1", stocked: true,  name: "Dragonfruit"},
  {category: "Fruits",     price: "$2", stocked: false, name: "Passionfruit"},
  {category: "Vegetables", price: "$2", stocked: true,  name: "Spinach"},
  {category: "Vegetables", price: "$4", stocked: false, name: "Pumpkin"},
  {category: "Vegetables", price: "$1", stocked: true,  name: "Peas"},
  {category: "Fruits",     price: "$5", stocked: true,  name: "Tomato"}
];

function App() {
  return (
    <div>
      <Estoque produtos={PRODUCTS}/>
    </div>
  );
}

export default App;
