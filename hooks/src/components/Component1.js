import React, {Component} from "react";
import Component2 from "./Component2";

class Component1 extends Component {
    constructor(props) {
        super(props)
        this.state = {
            name : 'Allen'
        }
        console.log('Life Cycle 1 Constructor')

        }
        static getDerivedStateFromProps(props, state) {
            console.log('Life Cycle 1 getDerivedStateFromProps')
    }
    componentDidMount() {
        console.log('Life Cycle 1 componentDidAmount')
    }
    shouldComponentUpdate() {
        console.log('Life Cycle 1 shouldComponentUpdate')
    }
    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log('Life Cycle 1 Life Cycle 1 shouldComponentUpdate')
    }
    componentDidUpdate(prevProps, prevState,snapshot) {
        console.log('Life Cycle 1 ComponentDidUpdate')
    }
    changeState= () => {
        this.setState({
            name:'Black'
        })
    }
    render() {
        console.log('Life Cycle1 render')
        return(
            <div>
                <button onClick={this.changeState}>change State</button>
                Life Cycle 1 <Component2/>
            </div>
        )
    }
}
export default Component1;