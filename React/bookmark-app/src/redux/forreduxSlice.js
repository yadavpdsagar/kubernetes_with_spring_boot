import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";

// Define the initial state for the slice
const initialState = {
  data: [],
  loading: false,
  error: null,
};

// Create an async thunk to fetch data from the API
export const fetchForreduxData = createAsyncThunk(
  "forredux/fetchData", // action name
  async () => {
    const response = await axios.get("http://localhost:8080/api/forredux");
    return response.data; // Return the response data
  }
);

// Create a slice with reducers and extraReducers
const forreduxSlice = createSlice({
  name: "forredux",
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(fetchForreduxData.pending, (state) => {
        state.loading = true;
        state.error = null;
      })
      .addCase(fetchForreduxData.fulfilled, (state, action) => {
        state.loading = false;
        state.data = action.payload;
      })
      .addCase(fetchForreduxData.rejected, (state, action) => {
        state.loading = false;
        state.error = action.error.message;
      });
  },
});

export default forreduxSlice.reducer;
