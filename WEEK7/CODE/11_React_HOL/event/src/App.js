import React, { Component } from 'react';
import CurrencyConvertor from './components/CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
      message: ''
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    this.setState({ message: 'Hello! This is a static message.' });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleClick = (event) => {
    console.log(event); // Synthetic event
    alert('I was clicked');
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>React Event Handling Examples</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>{' '}
        <button onClick={this.decrement}>Decrement</button>
        <p>{this.state.message}</p>

        <hr />

        <button onClick={() => this.sayWelcome('Welcome!')}>Say Welcome</button>

        <hr />

        <button onClick={this.handleClick}>Synthetic Event: OnPress</button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
