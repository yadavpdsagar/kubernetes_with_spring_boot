import { configureStore } from "@reduxjs/toolkit";
import forreduxReducer from "./forreduxSlice";

// Create the Redux store
const store = configureStore({
  reducer: {
    forredux: forreduxReducer,
  },
});

export default store;
