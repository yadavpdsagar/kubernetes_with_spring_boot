// src/BookmarkList.js

import React, { useState, useEffect } from "react";
import axios from "axios";

const BookmarkList = () => {
  const [bookmarks, setBookmarks] = useState([]);
  const [totalPages, setTotalPages] = useState(0);
  const [currentPage, setCurrentPage] = useState(1);
  const [loading, setLoading] = useState(false);

  // Fetch data from the API
  const fetchBookmarks = async (page = 1) => {
    setLoading(true);
    try {
      const response = await axios.get(
        `http://localhost:8080/api/bookmark?page=${page}`
      );
      setBookmarks(response.data.data);
      setTotalPages(response.data.totalPage);
      setCurrentPage(response.data.currentPage);
    } catch (error) {
      console.error("Error fetching data", error);
    }
    setLoading(false);
  };

  // Handle page change
  const handlePageChange = (pageNumber) => {
    fetchBookmarks(pageNumber);
  };

  // Fetch initial data when the component mounts
  useEffect(() => {
    fetchBookmarks(currentPage);
  }, [currentPage]);

  return (
    <div>
      <h1>Bookmarks</h1>

      {loading && <p>Loading...</p>}

      <ul>
        {bookmarks.map((bookmark) => (
          <li key={bookmark.id}>
            <strong>{bookmark.titel}</strong>
            <br />
            <a href={bookmark.url} target="_blank" rel="noopener noreferrer">
              {bookmark.url}
            </a>
            <br />
            <small>
              Created at: {new Date(bookmark.createAt).toLocaleString()}
            </small>
          </li>
        ))}
      </ul>

      <div>
        <button
          onClick={() => handlePageChange(currentPage - 1)}
          disabled={currentPage === 1}
        >
          Previous
        </button>
        <span>
          {" "}
          Page {currentPage} of {totalPages}{" "}
        </span>
        <button
          onClick={() => handlePageChange(currentPage + 1)}
          disabled={currentPage === totalPages}
        >
          Next
        </button>
      </div>
    </div>
  );
};

export default BookmarkList;
