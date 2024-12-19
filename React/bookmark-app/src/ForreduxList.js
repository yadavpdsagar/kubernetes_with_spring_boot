import React, { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useForm, Controller } from "react-hook-form";
import { fetchForreduxData } from "./redux/forreduxSlice";
import { Dropdown } from "primereact/dropdown";
import { MultiSelect } from "primereact/multiselect";
import { Button } from "primereact/button";
import "primereact/resources/themes/saga-blue/theme.css"; // PrimeReact Theme
import "primereact/resources/primereact.min.css"; // PrimeReact Core Styles
import "primeicons/primeicons.css"; // Icons
import "primeflex/primeflex.css"; // PrimeFlex for layout

const ForreduxList = () => {
  const dispatch = useDispatch();
  const { data, loading, error } = useSelector((state) => state.forredux);
  const { control, handleSubmit, setValue } = useForm();
  const [fieldsOptions, setFieldsOptions] = useState([]);

  // Fetch data when the component mounts
  useEffect(() => {
    dispatch(fetchForreduxData());
  }, [dispatch]);

  const onSubmit = (formData) => {
    console.log("Form Data on Submit: ", formData);

    const payload = {
      name: formData.name,
      fields: formData.fields.join(","),
    };

    console.log("Data to be saved: ", payload);
    // Call API or dispatch Redux action here
  };

  const handleNameChange = (selectedName) => {
    const selectedItem = data.find((item) => item.name === selectedName);
    const fields = selectedItem ? selectedItem.fields.split(",") : [];
    setFieldsOptions(fields);

    setValue("fields", fields); // Set default values in MultiSelect
  };

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;

  return (
    <div className="p-4">
      <h1>Forredux Data</h1>

      <form onSubmit={handleSubmit(onSubmit)}>
        <div className="formgrid grid">
          {/* Dropdown for Name Selection */}
          <div className="field col">
            <label htmlFor="name">Select Name</label>
            <Controller
              name="name"
              control={control}
              defaultValue=""
              rules={{ required: "Name is required" }}
              render={({ field }) => (
                <Dropdown
                  {...field}
                  id="name"
                  options={data.map((item) => ({
                    label: item.name,
                    value: item.name,
                  }))}
                  placeholder="Select a name"
                  onChange={(e) => {
                    field.onChange(e.value);
                    handleNameChange(e.value);
                  }}
                  className="p-inputtext"
                />
              )}
            />
          </div>

          {/* MultiSelect for Fields */}
          {fieldsOptions.length > 0 && (
            <div className="field col">
              <label htmlFor="fields">Select Fields</label>
              <Controller
                name="fields"
                control={control}
                defaultValue={[]}
                rules={{ required: "At least one field is required" }}
                render={({ field }) => (
                  <MultiSelect
                    {...field}
                    id="fields"
                    options={fieldsOptions.map((field) => ({
                      label: field,
                      value: field,
                    }))}
                    value={field.value || []}
                    onChange={(e) => field.onChange(e.value)}
                    placeholder="Select fields"
                    optionLabel="label"
                    display="chip"
                    className="p-inputtext"
                  />
                )}
              />
            </div>
          )}
        </div>

        <div className="field">
          <Button label="Submit" icon="pi pi-check" type="submit" />
        </div>
      </form>
    </div>
  );
};

export default ForreduxList;
