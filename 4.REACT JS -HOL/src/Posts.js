// src/Posts.js
import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      console.error('Error fetching posts:', error);
      this.setState({ hasError: true });
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.toString());
    console.error('Error boundary caught:', error, info);
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Something went wrong while loading posts.</h2>;
    }

    return (
      <div>
        <h1>Posts</h1>
        {posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;