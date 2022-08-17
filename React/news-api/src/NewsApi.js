export default function NewsApi() {
    const [news,setNews]=useState({});
    const fetchNews=()=>{
        axios.get('https://newsapi.org/v2/top-headlines?country=us&apiKey=)
        console.log("Button clicked");
    }
    return (
        <div>
        <button onClick={fetchNews}>Get News</button></div>
    )
}