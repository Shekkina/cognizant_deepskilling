import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('book');

  // Using if-else
  let content;
  if (view === 'book') {
    content = <BookDetails />;
  } else if (view === 'blog') {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  return (
    <div style={{ padding: 20 }}>
      <h1>📚 Blogger App</h1>
      <div>
        <button onClick={() => setView('book')}>Book</button>
        <button onClick={() => setView('blog')}>Blog</button>
        <button onClick={() => setView('course')}>Course</button>
      </div>

      <hr />

      {/* Render based on conditional logic */}
      {content}

      {/* Using Ternary */}
      {/* {view === 'book' ? <BookDetails /> : view === 'blog' ? <BlogDetails /> : <CourseDetails />} */}

      {/* Using Logical && operator */}
      {/* {view === 'book' && <BookDetails />} */}
      {/* {view === 'blog' && <BlogDetails />} */}
      {/* {view === 'course' && <CourseDetails />} */}
    </div>
  );
}

export default App;
