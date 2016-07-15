These were NER frequency outputs cleaned up using OpenRefine. Work done by Patrick O'Leary and Katie Mackinnon, MA students in the Department of History @ UWaterlo.

## Workflow

- Take the OpenRefine from Patrick/Katie, who go through and 'edit and cluster' using different distant measures;
- Continue in OpenRefine to do some additional clustering, review data as PI;
- Export from OpenRefine to CSV;
- Take the first 500 lines `head -500 CSV > output`
- Import the 500 lines to Excel, set up pivot table, combine and sum values;
- Export to Excel/CSV and keep in this repo.

Not the best workflow, but OpenRefine does not seem to easily combine and sum values.

Files are stored in categories, `loc`, `org`, and `pers`.
